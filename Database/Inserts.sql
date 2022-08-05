----- INSERTS CLIMA ----------

SELECT * FROM CLIMA;

INSERT INTO CLIMA(IDCLIMA,TIPOCLIMA)
VALUES (1,'Tropical'); ---sabana tropical

INSERT INTO CLIMA(IDCLIMA,TIPOCLIMA)
VALUES (2,'Seco'); ---o arido

INSERT INTO CLIMA(IDCLIMA,TIPOCLIMA)
VALUES (3,'Templado'); ---- intermedio entre calido y frio

INSERT INTO CLIMA(IDCLIMA,TIPOCLIMA)
VALUES (4,'Continental'); ---Diferencia entre invierno y verano


--update CLIMA set TIPOCLIMA='Tropical' where IDCLIMA=1;

----- INSERTS ENFERMEDAD ---------- CAMBIAR DESCRIPCION DE 100 A 350 LIMITE

SELECT * FROM ENFERMEDAD;

INSERT INTO ENFERMEDAD(IDENFERMEDAD,NOMBRE,DESCRIPCION)
VALUES (1,'Exceso de Luz','Puntas o bordes de las hojas color marrón, parches color marrón, follaje pálido, marchitez.');

INSERT INTO ENFERMEDAD(IDENFERMEDAD,NOMBRE,DESCRIPCION)
VALUES (2,'Aire Seco','Follaje erizado, arrugado y crujiente, las flores no florecen, pérdida de hojas.');

INSERT INTO ENFERMEDAD(IDENFERMEDAD,NOMBRE,DESCRIPCION)
VALUES (3,'Alternaria','Se puede ver fácilmente que las hojas tienen pequeñas manchas marrones con un halo amarillo 
que se convierten en manchas irregulares tan grandes como unas tres cuartas partes de pulgada.');

INSERT INTO ENFERMEDAD(IDENFERMEDAD,NOMBRE,DESCRIPCION)
VALUES (4,'Virus Mancha Amarilla del Iris','Afectando principalmente a las cebollas y especies de Allium, sus lesiones 
tienen forma de diamante y aparecen en  una serie de anillos concéntricos alrededor del punto de alimentación de los Tisanópteros. 
Los anillos varían en color verde claro y oscuro, así como amarillos de tipo paja');

INSERT INTO ENFERMEDAD(IDENFERMEDAD,NOMBRE,DESCRIPCION)
VALUES (5,'Phytophthora o Fitóftora','Ataca las raíces directamente, causando estragos bajo la superficie. Si crees que una planta
puede tener esta enfermedad, deséchala suavemente y comprueba las raíces. Las raíces infectadas eventualmente se volverán suaves,
arrugadas y oscuras, se marchitarán y se caerán.');


----- INSERTS PESTES ---------- CAMBIAR DESCRIPCION DE 100 A 350 LIMITE

SELECT * FROM PESTE;

INSERT INTO PESTE(IDPESTE,NOMBRE,DESCRIPCION)
VALUES (1,'Moscas Blancas','Son pequeños insectos voladores de forma triangular con un cuerpo amarillo pálido o blanco y alas blancas. 
Los signos de daño por mosca blanca incluyen hojas que se vuelven amarillas y se caen del tallo y 
retraso en el crecimiento general.');

INSERT INTO PESTE(IDPESTE,NOMBRE,DESCRIPCION)
VALUES (2,'Araña roja','Probablemente verás el daño antes de notar la infestación. Aparecerán manchas marrón o amarillas en las hojas. 
Puedes observar las "redes" que crean en las hojas. Para identificarlas puedes agitar la hoja sobre un trozo de papel y 
caerán alli. Una lupa facilitará el proceso.');

INSERT INTO PESTE(IDPESTE,NOMBRE,DESCRIPCION)
VALUES (3,'Pulgones','Son insectos verdes diminutos, redondos y alados que consumen savia vegetal. Cuando las plantas están infestadas, 
mostrarán hojas amarillentas. A mayor infestación, las hojas pueden atrofiarse, deformarse y comenzar a enroscarse. Las hojas y 
los tallos estar recubiertos de una sustancia transparente y pegajosa.');

INSERT INTO PESTE(IDPESTE,NOMBRE,DESCRIPCION)
VALUES (4,'Acari','Son una familia de arácnidos que incluye garrapatas y ácaros, no tienen alas ni antenas. Usualmente aplicar 
muchos nutrientes a las plamtas, suele atraerlos. Se puede tratar rociándole extracto de manzanilla y pasando un paño húmedo 
sobre las hojas.');

INSERT INTO PESTE(IDPESTE,NOMBRE,DESCRIPCION)
VALUES (5,'Insectos Coccoidea o de escama','Son ávidos chupadores de savias. Literalmente chupan la vida de las plantas, y sus 
hojas pueden mostrar los signos al empezar a palidecerse y decolorarse. Pueden frenar el crecimiento de su planta, hacer que se 
vuelvan amarillas y, en general, hacer que su salud sufra. Para evitar que empeoren o se propaguen, se deben erradir rápidamente.');


----- INSERTS ESTACIONFLORECIMIENTO ----------

SELECT * FROM ESTACIONFLORECIMIENTO;

INSERT INTO ESTACIONFLORECIMIENTO(IDESTACIONFLORECIMIENTO,ESTACION)
VALUES (1,'Raramente.'); 

INSERT INTO ESTACIONFLORECIMIENTO(IDESTACIONFLORECIMIENTO,ESTACION)
VALUES (2,'Verano'); 

INSERT INTO ESTACIONFLORECIMIENTO(IDESTACIONFLORECIMIENTO,ESTACION)
VALUES (3,'Otoño'); 

INSERT INTO ESTACIONFLORECIMIENTO(IDESTACIONFLORECIMIENTO,ESTACION)
VALUES (4,'Primavera'); 

INSERT INTO ESTACIONFLORECIMIENTO(IDESTACIONFLORECIMIENTO,ESTACION)
VALUES (5,'Durante todo el año'); 


----- INSERTS EXPOSICIONSOLAR ----------


SELECT * FROM EXPOSICIONSOLAR;

INSERT INTO EXPOSICIONSOLAR(IDEXPOSICIONSOLAR,TIPOEXPOSICIONSOLAR)
VALUES (1,'Luz Solar Directo.'); 

INSERT INTO EXPOSICIONSOLAR(IDEXPOSICIONSOLAR,TIPOEXPOSICIONSOLAR)
VALUES (2,'Luz Solar Indirecta'); 

INSERT INTO EXPOSICIONSOLAR(IDEXPOSICIONSOLAR,TIPOEXPOSICIONSOLAR)
VALUES (3,'Luz Solar media'); 

INSERT INTO EXPOSICIONSOLAR(IDEXPOSICIONSOLAR,TIPOEXPOSICIONSOLAR)
VALUES (4,'Luz Solar Baja'); 

INSERT INTO EXPOSICIONSOLAR(IDEXPOSICIONSOLAR,TIPOEXPOSICIONSOLAR)
VALUES (5,'Poca/ninguna luz'); 


----- INSERTS PRODUCTOVIVERO ----------

SELECT * FROM PRODUCTOVIVERO;

INSERT INTO PRODUCTOVIVERO(IDPRODUCTO,NOMBRE,DESCRIPCIONPRODUCTO,PRECIOPRODUCTO,IDPROVEEDOR,IMAGENPRODUCTOVIVERO)
VALUES (1,'Nitrato de Calcio','Fuente de Calcio para su planta, 100% diluible en agua. Ideal para el fertirriego',6000,3,
'..\ProyectoVivero\Imagenes\nitrato-de-calcio.jpg'); 

INSERT INTO PRODUCTOVIVERO(IDPRODUCTO,NOMBRE,DESCRIPCIONPRODUCTO,PRECIOPRODUCTO,IDPROVEEDOR,IMAGENPRODUCTOVIVERO)
VALUES (2,'Sustrato Baby Orquideas','Nutricion especial para orquideas.',5000,4,'..\ProyectoVivero\Imagenes\baby-orquideas.png'); 

INSERT INTO PRODUCTOVIVERO(IDPRODUCTO,NOMBRE,DESCRIPCIONPRODUCTO,PRECIOPRODUCTO,IDPROVEEDOR,IMAGENPRODUCTOVIVERO)
VALUES (3,'Fertilizante Miracle Mix','Este fertilizante ayuda al crecimiento de la planta, fortaleciéndola desde la raíz.'
,10000,4,'..\ProyectoVivero\Imagenes\Fertilizante-MiracleMix.png'); 

INSERT INTO PRODUCTOVIVERO(IDPRODUCTO,NOMBRE,DESCRIPCIONPRODUCTO,PRECIOPRODUCTO,IDPROVEEDOR,IMAGENPRODUCTOVIVERO)
VALUES (4,'Abono Granulado','Abono para plantas sanas y fuertes.',3000,5,'..\ProyectoVivero\Imagenes\abono-nutrione-granul.jpg');

INSERT INTO PRODUCTOVIVERO(IDPRODUCTO,NOMBRE,DESCRIPCIONPRODUCTO,PRECIOPRODUCTO,IDPROVEEDOR,IMAGENPRODUCTOVIVERO)
VALUES (5,'Maceta Terraoota','Maceta Color Terracota, diámetro 46cm.',5000,1,'..\ProyectoVivero\Imagenes\maceta.jpg');



----- INSERTS PROVEEDOR ----------

SELECT * FROM PROVEEDOR;

INSERT INTO PROVEEDOR(IDPROVEEDOR,NOMBRE,TELEFONO,CORREOELECTRONICO)
VALUES (1,'La Plantita Feliz.','506-2223-5020','plantitafeliz@gmail.com'); 

INSERT INTO PROVEEDOR(IDPROVEEDOR,NOMBRE,TELEFONO,CORREOELECTRONICO)
VALUES (2,'Plantas y Mas','506-4028-5055','plantasymas@hotmail.com');    

INSERT INTO PROVEEDOR(IDPROVEEDOR,NOMBRE,TELEFONO,CORREOELECTRONICO)
VALUES (3,'Green Goku','506-6533-7525','greengoku@gmail.com'); 

INSERT INTO PROVEEDOR(IDPROVEEDOR,NOMBRE,TELEFONO,CORREOELECTRONICO)
VALUES (4,'EverGreen','506-4020-6060','evergreen@evergreen.cr'); 

INSERT INTO PROVEEDOR(IDPROVEEDOR,NOMBRE,TELEFONO,CORREOELECTRONICO)
VALUES (5,'NutriPlanta','506-8024-3400','nutriplanta@infonutriplanta.cr');


-------INSERTS PROPAGACION ----------

SELECT * FROM PROPAGACION;

INSERT INTO PROPAGACION(IDPROPAGACION,DESCRIPCION)
VALUES (1,'Semillas.');

INSERT INTO PROPAGACION(IDPROPAGACION,DESCRIPCION)
VALUES (2,'Separación de tallo al transplantar.');

INSERT INTO PROPAGACION(IDPROPAGACION,DESCRIPCION)
VALUES (3,'Cortar un tallo con hoja y ponerlo en agua.');


-------INSERTS REGIONNATIVA ---------- CAMBIAR REGION 25 LIMITE

SELECT * FROM REGIONNATIVA;

INSERT INTO REGIONNATIVA(IDREGION,REGION)
VALUES (1,'Sur América');

INSERT INTO REGIONNATIVA(IDREGION,REGION)
VALUES (2,'Europa');

INSERT INTO REGIONNATIVA(IDREGION,REGION)
VALUES (3,'Asia');

INSERT INTO REGIONNATIVA(IDREGION,REGION)
VALUES (4,'Africa');

INSERT INTO REGIONNATIVA(IDREGION,REGION)
VALUES (5,'Mediterráneo Oriental');


-------INSERTS RIEGO ----------


SELECT * FROM RIEGO;

INSERT INTO RIEGO(IDRIEGO,FRECUENCIA)
VALUES (1,'Todos los días.');

INSERT INTO RIEGO(IDRIEGO,FRECUENCIA)
VALUES (2,'Día de por medio.');

INSERT INTO RIEGO(IDRIEGO,FRECUENCIA)
VALUES (3,'Dos veces a la semana.');

INSERT INTO RIEGO(IDRIEGO,FRECUENCIA)
VALUES (4,'Una vez a la semana.');

INSERT INTO RIEGO(IDRIEGO,FRECUENCIA)
VALUES (5,'Cada diez días.');

-------INSERTS SUELO ----------


SELECT * FROM SUELO;

INSERT INTO SUELO(IDSUELO,TIPOSUELO)
VALUES (1,'Suelo Arenoso.');

INSERT INTO SUELO(IDSUELO,TIPOSUELO)
VALUES (2,'Suelo Húmedo.');

INSERT INTO SUELO(IDSUELO,TIPOSUELO)
VALUES (3,'Suelo Arcilloso.');

INSERT INTO SUELO(IDSUELO,TIPOSUELO)
VALUES (4,'Drenaje Rápido.');

INSERT INTO SUELO(IDSUELO,TIPOSUELO)
VALUES (5,'Tipo Tierra Suelta.');

-------INSERTS TIPOPLANTA ----------


SELECT * FROM TIPOPLANTA;

INSERT INTO TIPOPLANTA(IDTIPOPLANTA,TIPO)
VALUES (1,'Hierba');

INSERT INTO TIPOPLANTA(IDTIPOPLANTA,TIPO)
VALUES (2,'Arbusto');

INSERT INTO TIPOPLANTA(IDTIPOPLANTA,TIPO)
VALUES (3,'Árbol');

INSERT INTO TIPOPLANTA(IDTIPOPLANTA,TIPO)
VALUES (4,'Suculenta');

INSERT INTO TIPOPLANTA(IDTIPOPLANTA,TIPO)
VALUES (5,'Helecho');


-------INSERTS PLANTA ---------- CAMBIAR DESCRIPCION DE 250 A 350 LIMITE

SELECT * FROM PLANTA;

INSERT INTO PLANTA(IDPLANTA,NOMBRECOMUN,NOMBRECIENTIFICO,
IDCLIMA,IDSUELO,IDEXPOSICIONSOLAR,
IDRIEGO,IDTIPOPLANTA,IDESTACIONFLORECIMIENTO,
IDREGION,TOXICIDAD,IDPESTE,IDENFERMEDAD,
DESCRIPCION,
PRECIOPLANTA,IDPROPAGACION,
IMAGENPLANTA,IDPROVEEDOR)
VALUES (1,'Alocasia Frydek','Alocasia micholitziana Frydek',
1,5,2,
3,1,2,
3,'Tóxica para gatos, perros y caballos.',2,2,
'Es una variedad deslumbrante que muestra hojas aterciopeladas de color verde oscuro con vetas blancas marcadas. Ha ganado popularidad y 
ahora se cultiva comúnmente en interiores. Al igual que con la mayoría de su especie, mantener feliz al frydek puede ser un poco desafiante. , 
pero su impresionante follaje hace que valga la pena.',
11000,2,'..\ProyectoVivero\Imagenes\Alocasia.png',2);



INSERT INTO PLANTA(IDPLANTA,NOMBRECOMUN,NOMBRECIENTIFICO,
IDCLIMA,IDSUELO,IDEXPOSICIONSOLAR,
IDRIEGO,IDTIPOPLANTA,IDESTACIONFLORECIMIENTO,
IDREGION,TOXICIDAD,IDPESTE,IDENFERMEDAD,
DESCRIPCION,
PRECIOPLANTA,IDPROPAGACION,
IMAGENPLANTA,IDPROVEEDOR)
VALUES (2,'Lengua de Suegra o Sansevieria','Sansevieria trifasciata',
1,4,3,
5,1,4,
4,'Tóxica para humanos y mascotas.',4,1,
'Es una planta fácil de cultivar. Se trata de una planta muy decorativa y resistente. 
La sansevieria aguanta muy bien tanto temperaturas elevadas como bajas (hasta -5?°C). 
Además, es una planta que ayuda a limpiar el aire del interior de la casa.',
7000,2,'..\ProyectoVivero\Imagenes\sanseviera.png',1);


INSERT INTO PLANTA(c,NOMBRECOMUN,NOMBRECIENTIFICO,
IDCLIMA,IDSUELO,IDEXPOSICIONSOLAR,
IDRIEGO,IDTIPOPLANTA,IDESTACIONFLORECIMIENTO,
IDREGION,TOXICIDAD,IDPESTE,IDENFERMEDAD,
DESCRIPCION,
PRECIOPLANTA,IDPROPAGACION,
IMAGENPLANTA,IDPROVEEDOR)
VALUES (3,'Albahaca','Ocimum basilicum',
1,2,1,
2,1,2,
4,'No Tóxica.',1,5,
'Se trata de una de las plantas aromáticas preferidas en nuestras cocinas, así como de un magnífico condimento para diferentes 
platos. Por esta razón, la albahaca común y la albahaca genovesa (usada comúnmente en recetas de pasta) nos resultan 
especialmente familiares. ',
5000,3,'..\ProyectoVivero\Imagenes\sanseviera.png',3);















