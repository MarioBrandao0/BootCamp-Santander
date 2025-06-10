# Dio resumo Git e GitHub

Repositorio para armazenar resumo sobre o git e GitHub que estou vendo no DIO [BootCamp-Santender](https://www.dio.me/)

## Comandos git
`git init` -> Inicia um repositorio localmente

`git remote add origin [link repositorio]` vincula o repositorio local atual com o repositorio remoto que informar no link

`git clone [link repositorio]` -> isso cria um clone do repositorio remoto na sua maquina e você ainda pode passar um nome no final para poder a pasta ficar com o nome dessejado

`git remote -v` -> mostra todas as branchs remotas vinculadas ao diretorio atual

`git pull origin [branch]` -> puxa as informações do repositorio remoto para sua branch atual, podemos passar o nome da branch após o pull para poder puxar de determinada branch

`git status` -> mostra os status na nossa arvore de projeto. Com arquivos que ainda não foram rastreados e os que tinham e acabaram sendo excluidos.

## Comando `git reset`

O `git reset` é usado para voltar o histórico do projeto para um ponto anterior. Ele tem três modos principais que controlam o que acontece com os arquivos salvos e não salvos.

### `git reset --soft`
Volta o projeto para um commit anterior **mas mantém todos os arquivos prontos para serem comitados de novo**.
### `git reset --mixed`
Volta o projeto para o commit desejado usando o hash dele (mantem os arquivos para que sejam adicionados e dps commitados)

### `git reset --hard`
Retorna todo o projeto para o commit desejado e deleta os arquivos para ficar identico ao commmit

## Comandos extras:
`echo [conteudo]/ > .gitignore` -> isso vai criar um arquivo gitignore caso ele não exista e vai adicionar o nosso conteudo a ele
