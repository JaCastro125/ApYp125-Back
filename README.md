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
== Table structure for table hys

|------
|Column|Type|Null|Default
|------
|//**id**//|int|No|
|nombre|varchar(255)|Yes|NULL
|porcentaje|int|No|
|img|varchar(255)|Yes|NULL
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
== Table structure for table proyecto

|------
|Column|Type|Null|Default
|------
|//**id**//|int|No|
|descripcion|varchar(255)|No|
|nombre|varchar(50)|No|
|url|varchar(255)|No|
|img|varchar(255)|Yes|NULL
== Table structure for table rol

|------
|Column|Type|Null|Default
|------
|//**id**//|int|No|
|rol_nombre|varchar(255)|No|
== Table structure for table usuario

|------
|Column|Type|Null|Default
|------
|//**id**//|int|No|
|email|varchar(255)|No|
|nombre|varchar(255)|No|
|**nombre_usuario**|varchar(255)|No|
|password|varchar(255)|No|
== Table structure for table usuario_rol

|------
|Column|Type|Null|Default
|------
|//**usuario_id**//|int|No|
|//**rol_id**//|int|No|
