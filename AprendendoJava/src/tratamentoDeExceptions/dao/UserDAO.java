package tratamentoDeExceptions.dao;

import tratamentoDeExceptions.exceptions.EmptyStorageException;
import tratamentoDeExceptions.exceptions.UserNotFoundException;
import tratamentoDeExceptions.mode.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private long nextId = 1L;

    private final List<UserModel> listModels = new ArrayList<>();


    /**
     * Recebe um model de user e salva ele na listModels e retorna o model salvo
     * @param model
     * @return Usermodel
     */
    public UserModel save(final UserModel model) {
        model.setId(nextId++);
        listModels.add(model);
        return model;
    }

    public UserModel update(final UserModel model) {
        UserModel updatedModel = findById(model.getId());
        listModels.remove(updatedModel);
        listModels.add(model);
        return model;
    }

    public void delete(final long id) {
        UserModel deletedModel = findById(id);
        listModels.remove(deletedModel);
    }

    public UserModel findById(final long id) {
        verifyStorage();//Verifica o listModels, se estiver vazio, lança uma exception e não passa para o resto do codigo

        String message = "Usuário não encontrado";
        return listModels.stream()
                .filter(user -> user.getId() == id)
                .findFirst().orElseThrow(() -> new UserNotFoundException(message));
    }

    public List<UserModel> findAll() {
        return listModels.isEmpty() ? null : listModels;
    }

    private void verifyStorage() {
        if(listModels.isEmpty()) throw new EmptyStorageException("Sem usuários cadastrados");
    }

}
