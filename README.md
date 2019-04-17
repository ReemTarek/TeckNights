# TeckNights
this is a user management api (PHP/Laravel)
This API is about getting information about candidates like profile information, applying for companies, followers….
Till now it contains basic information about user name , email ,password and his ID,
This API is based on Laravel framework and there are some pre-requests to use it:
First there must be installed XAMPP package and make sure it contains PHP at least version 7,
Then download api from our link in github.
DELETE folder vendor (IMPORTANT)
Then open command shell in folder and apply the following command:
php -r "copy('https://getcomposer.org/installer', 'composer-setup.php');"
php -r "if (hash_file('sha384', 'composer-setup.php') === '48e3236262b34d30969dca3c37281b3b4bbe3221bda826ac6a9a62d6444cdb0dcd0615698a5cbe587c3f0fe57a54d8f5') { echo 'Installer verified'; } else { echo 'Installer corrupt'; unlink('composer-setup.php'); } echo PHP_EOL;"
php composer-setup.php
php -r "unlink('composer-setup.php');"

it will download vendor folder for your own PC
then you will find .env file
open it and do the following : “IMPORTANT: you must create your database name”
change the following parameters:
DB_CONNECTION=mysql
DB_HOST=localhost
DB_DATABASE=user //here you should put your database name
DB_USERNAME=root  //your username in mysql “default is set to root”
DB_PASSWORD='' //yourpassword “default is set to empty”
Then after that open the command shell again:
Add command: php artisan migrate
It will create automatically tables inside your database
Then apply the next command:
php artisan serve

now you’re ready to use the API:
take the address that is showed in command
 
Now use it in postman to get the services (signup, login, logout, update, delete)

IMPORTANT:
Don’t forget to add in headers for all requests -except- logout- :
Content-Type : application/json
X-Requested-With :XMLHttpRequest
And in logout add in headers what is mentioned above
