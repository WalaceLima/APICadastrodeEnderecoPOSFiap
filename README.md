# Cadastro de Endereco 
 API de gestão de endereços pretende permitir o gerenciamento de informações sobre os endereços cadastrados em nosso sistema. Essa API deve:
    - Receber as informações dos endereços com os campos de rua, número, bairro, cidade e estado.
    - Receber as solicitações em formato HTTP POST.
    - As informações devem ser validadas para garantir que elas estão no formato correto e que são válidas.
    - Caso haja algum erro, a API deve retornar uma mensagem de erro indicando o problema encontrado.
    - Uma vez validadas as informações, a API deve informar que está tudo ok e dar um retorno positivo ao usuário.

### Endpoint: 
- /enderecos

### Método HTTP:
- Post
  
### Descrição:
Este endpoint cria um novo endereço com base nos parâmetros fornecidos.
Neste exemplo, o endpoint é do tipo POST e os parâmetros de solicitação são enviados no corpo da solicitação em formato JSON. Os parâmetros incluem número, bairro, cidade, estado e rua, que são utilizados para criar um novo endereço.

### Parâmetros no corpo da solicitação (JSON):

![alt text](https://s4.aconvert.com/convert/p3r68-cdx67/akvbx-7kow1.png)

Exemplo de solicitação:
- POST /enderecos

#### Exemplo de solicitação:

![alt text](https://s4.aconvert.com/convert/p3r68-cdx67/a1kmm-f5eui.png)

Formato de resposta:
Cabeçalho HTTP:

#### Corpo da resposta (JSON):

![alt text](https://s4.aconvert.com/convert/p3r68-cdx67/alezq-u5lgw.png))

#### Lidando com Erros

A API possui um mecanismo robusto para lidar com erros e fornece respostas adequadas para diferentes cenários. A seguir estão os possíveis códigos de status que podem ser retornados em diferentes situações:

#### Exemplo de Headers.

![alt text](https://s4.aconvert.com/convert/p3r68-cdx67/ae496-poz8d.png)

#### Corpo da solicitação.

![alt text](https://s4.aconvert.com/convert/p3r68-cdx67/aonv8-e72do.png)

- Resposta 201 Created: Este código de status é retornado quando uma solicitação de criação de recurso é bem-sucedida.

#### Corpo da solicitação inválida:

![alt text](https://s4.aconvert.com/convert/p3r68-cdx67/a808e-k7041.png)

![alt text](https://s4.aconvert.com/convert/p3r68-cdx67/amz9x-azsmc.png)

- É retornado um erro quando a solicitação e inválida ou parâmetros ausentes.

### Repositório API:
- [API de Endereços](https://github.com/WalaceLima/APICadastrodeEnderecoPOSFiap/tree/main/APICadastrodeEndereco).



