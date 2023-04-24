# ApYp125-Back

===Database bwrgwj8pxlgzkirnmq66

== Table structure for table educacion

|------
|Column|Type|Null|Default
|------
|//**id**//|int|No|
|descripcione|varchar(255)|Yes|NULL
|estadoe|varchar(255)|Yes|NULL
|nombree|varchar(255)|Yes|NULL
|periodoe|varchar(255)|Yes|NULL
|tituloe|varchar(255)|Yes|NULL
|logoe|varchar(255)|Yes|NULL
== Dumping data for table educacion

|1| |Completado|Universidad Catolica de Cordoba|1999 - 2015|Contador Publico Nacional|NULL
|2| |Completado|Universidad Catolica de Cordoba|1999 - 2015|Contador Publico Nacional|NULL
== Table structure for table experiencia

|------
|Column|Type|Null|Default
|------
|//**id**//|int|No|
|descripcione|varchar(255)|Yes|NULL
|nombree|varchar(255)|Yes|NULL
|periodoe|varchar(255)|Yes|NULL
|puestoe|varchar(255)|Yes|NULL
|imge|varchar(255)|Yes|NULL
== Dumping data for table experiencia

|1|Direccion general y Administracion de RRHH|La Casa de Chicha SRL|1999 - 2015|Socio / Gerente|NULL
|2|Asesoramiento contable|Estudio contable Castro y asoc.|2005 - actualidad|Socio / genrete|NULL
== Table structure for table hys

|------
|Column|Type|Null|Default
|------
|//**id**//|int|No|
|nombre|varchar(255)|Yes|NULL
|porcentaje|int|No|
|img|varchar(255)|Yes|NULL
== Dumping data for table hys

|1|HTML|85|NULL
|2|CSS|80|NULL
|3|JS|60|NULL
== Table structure for table persona

|------
|Column|Type|Null|Default
|------
|//**id**//|int|No|
|apellido|varchar(50)|No|
|celular|bigint|No|
|ciudad|varchar(255)|No|
|descripcion|varchar(255)|No|
|edad|int|No|
|email|varchar(255)|No|
|img|varchar(255)|Yes|NULL
|nombre|varchar(50)|No|
|titulo|varchar(255)|No|
|banner|varchar(255)|Yes|NULL
== Dumping data for table persona

|1|Castro|3513481225|San Fernando del Valle de Catamarca|un gran breve descripcion|45|likeyou201120@gmail.com|https://firebasestorage.googleapis.com/v0/b/apyp125-portfolio.appspot.com/o/imagen%2Fperfil_1?alt=media&amp;token=65bbbdd2-629c-4e91-a87e-600f4a3a4627|Javier Agustin|Fullstack Jr developper|NULL
== Table structure for table proyecto

|------
|Column|Type|Null|Default
|------
|//**id**//|int|No|
|descripcion|varchar(255)|No|
|nombre|varchar(50)|No|
|url|varchar(255)|No|
|img|varchar(255)|Yes|NULL
== Dumping data for table proyecto

|1|pagina dinamica|Amazing Events|https://github.com/JaCastro125/AmazingEvents_CASTRO|NULL
|2|Pagina estatica, vanilla|MDHL|https://github.com/JaCastro125/MDHL_Castro|NULL
== Table structure for table rol

|------
|Column|Type|Null|Default
|------
|//**id**//|int|No|
|rol_nombre|varchar(255)|No|
== Dumping data for table rol

|1|ROLE_ADMIN
|2|ROLE_USER
== Table structure for table usuario

|------
|Column|Type|Null|Default
|------
|//**id**//|int|No|
|email|varchar(255)|No|
|nombre|varchar(255)|No|
|**nombre_usuario**|varchar(255)|No|
|password|varchar(255)|No|
== Dumping data for table usuario

|1|admin@admin.com|admin|admin|$2a$10$6IoF2Nu/Q1saDMj/tquU3.J.8abU6.SZxijwwTb1iU5YQH/Uvv5Z2
|2|user@user.com|user|user|$2a$10$TDDXCkVMYjlifx9PJYHZ8uRNKjvzV2MYmDpOD1MdkvGJhhawk2tiW
|3|likeyou201120@gmail.com|javier|javiercastro|$2a$10$Xb3C6cFNOSebq4.yPLhCaO.Aly4wK5uOczNjnDjxeZEa3tqCAitKy
== Table structure for table usuario_rol

|------
|Column|Type|Null|Default
|------
|//**usuario_id**//|int|No|
|//**rol_id**//|int|No|
== Dumping data for table usuario_rol

|1|1
|3|1
|1|2
|2|2
|3|2
