# Proyecto Semana 3

Este proyecto se basa en el desarrollo de una aplicación con Sprinboot.

Incluye un CRUD basico, e incorpora una API Rest muy sencilla.

Esta aplicación se ha hecho con la intención de ser ampliada a lo largo de las siguientes semanas.


## Authors

- [Sergio](https://www.github.com/sreturns)


## Tech Stack

 Java, SpringBoot, Maven


## API Reference


#### Get Course by Id

```
  GET /course/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Course` | **Required**. Id of course to fetch 

#### Add Course

```
  POST /course
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Course`      |  | **Required**. Type Course object 

#### Update Course

```
  PUT /course/{id}?d=
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id, duration`      |  | **Required**. id of Course to fetch

#### Delete Course

```
  DELETE /course/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      |  | **Required**. Id of Course to fetch  


## Clone Respository

Para comenzar a trabajar con este proyecto, sigue estos pasos para clonar el repositorio en tu máquina local:

Abre tu terminal o línea de comandos.

Ejecuta el siguiente comando para clonar el repositorio:

   ```bash
   git clone git@github.com:sreturns/03_crud_cursos.git
```
## Contributing

¡Las contribuciones son siempre bienvenidas!

Cambia al directorio del repositorio recién clonado:

```
cd tu-repositorio
```

Clona el repositorio como se describe arriba.

Crea una nueva rama para tu trabajo:

```
git checkout -b nombre-de-la-rama
```
Realiza tus cambios y haz commit:

```
git add .
git commit -m "Descripción de los cambios"
```

Envía tus cambios al repositorio remoto:
```
git push origin nombre-de-la-rama
```

## 🔗 Links
- [Project](https://github.com/sreturns/03_crud_cursos)