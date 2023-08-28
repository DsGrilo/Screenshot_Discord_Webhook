# Java 20 Screenshot Service with Google Cloud Platform Integration

Este repositório contém um serviço Java 20 que permite capturar screenshots da tela de um dispositivo e salvar essas capturas em um bucket no Google Cloud Platform (GCP). Além disso, o serviço é capaz de enviar notificações com as screenshots para um webhook no Discord.

## Funcionalidades
* Captura de screenshots da tela do dispositivo.
* Armazenamento das screenshots em um bucket no Google Cloud Storage.
* Notificações automáticas via webhook do Discord com as screenshots capturadas.

## Pré-requisitos
Antes de executar o serviço, você precisará das seguintes ferramentas e configurações:

1 - Java 20: Certifique-se de ter o Java 20 ou uma versão superior instalada no seu sistema. </br>
2 - Google Cloud Platform (GCP) Account: É necessário ter uma conta na GCP e configurar as credenciais de autenticação. </br>
3 - Google Cloud Storage Bucket: Crie um bucket no GCP para armazenar as screenshots capturadas. </br>
4 - Discord Webhook: Crie um webhook no Discord para receber as notificações com as screenshots capturadas. </br>

## Configuração
Siga os passos abaixo para configurar o serviço:

1 - Clone o repositório: </br>
2 - Adicione o seu BUCKET (PRECISA SER PUBLICO, SERVIÇO NÃO UTILIZA AUTENTICAÇÃO) no StorageCloud.class Linha 17.
3 - Adicione o seu URL do WEBHOOK do Discord em Main.class Linha 34
4 - Compile e execute o serviço:

```shell
$ javac Main.java
$ java Main
```
## Uso

O serviço será iniciado e começará a capturar screenshots em intervalos regulares. As screenshots serão armazenadas no bucket do GCP e notificações serão enviadas para o webhook do Discord com links para as imagens capturadas.

Certifique-se de ajustar os intervalos de captura, o local de armazenamento no bucket e outras configurações conforme necessário.


Java 20 Screenshot Service with Google Cloud Platform Integration
Service Demo

Este repositório contém um serviço Java 20 que permite capturar screenshots da tela de um dispositivo e salvar essas capturas em um bucket no Google Cloud Platform (GCP). Além disso, o serviço é capaz de enviar notificações com as screenshots para um webhook no Discord.

Funcionalidades
Captura de screenshots da tela do dispositivo.
Armazenamento das screenshots em um bucket no Google Cloud Storage.
Notificações automáticas via webhook do Discord com as screenshots capturadas.
Pré-requisitos
Antes de executar o serviço, você precisará das seguintes ferramentas e configurações:

Java 20: Certifique-se de ter o Java 20 ou uma versão superior instalada no seu sistema.
Google Cloud Platform (GCP) Account: É necessário ter uma conta na GCP e configurar as credenciais de autenticação.
Google Cloud Storage Bucket: Crie um bucket no GCP para armazenar as screenshots capturadas.
Webhook do Discord: Configure um webhook em um servidor do Discord para receber as notificações com as screenshots.
Configuração
Clone este repositório para o seu ambiente local:
bash
Copy code
git clone https://github.com/seu-usuario/screenshot-service.git
cd screenshot-service
Configure as credenciais da GCP:

Substitua seu-arquivo-de-credenciais.json pelo nome do arquivo de credenciais da GCP.
Coloque o arquivo de credenciais na raiz do projeto.
Configure o webhook do Discord:

Substitua SEU_WEBHOOK_URL pela URL do seu webhook no arquivo discord_notification.java.
Compile e execute o serviço:

bash
Copy code
javac ScreenshotService.java
java ScreenshotService
Uso
O serviço será iniciado e começará a capturar screenshots em intervalos regulares. As screenshots serão armazenadas no bucket do GCP e notificações serão enviadas para o webhook do Discord com links para as imagens capturadas.

Certifique-se de ajustar os intervalos de captura, o local de armazenamento no bucket e outras configurações conforme necessário.

## Contribuição
Contribuições são bem-vindas! Se você encontrar algum problema ou tiver melhorias para sugerir, fique à vontade para abrir uma issue ou enviar um pull request.

## Licença
Este projeto está licenciado sob os termos da Licença MIT.

### Nota: Este projeto é apenas para fins de demonstração e pode não estar otimizado para uso em produção. Use por sua conta e risco.

#### DsGrilo 