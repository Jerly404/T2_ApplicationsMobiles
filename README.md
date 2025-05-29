# 📱 Aplicación Android con Firebase – CRUD y Autenticación

Este proyecto consiste en una aplicación Android desarrollada en Android Studio. Implementa autenticación de usuarios y operaciones CRUD completas utilizando Firebase. Fue desarrollado como parte del curso de Desarrollo de Aplicaciones Móviles.

## 🚀 Funcionalidades principales

- 🔐 **Autenticación de usuarios con Firebase Authentication**
  - Registro de nuevos usuarios
  - Inicio de sesión
  - Cierre de sesión

- ☁️ **Base de datos en tiempo real con Firebase Firestore**
  - Crear, leer, actualizar y eliminar registros
  - Cada registro contiene:
    - 📝 Dos campos de texto
    - 🔢 Un campo numérico
    - 🖼️ Una imagen

- 📋 **Visualización de datos**
  - Lista de registros mostrada con `RecyclerView`
  - Detalle y edición de cada ítem

## 🧠 Arquitectura y buenas prácticas

- Patrón **MVVM** (Model-View-ViewModel)
- Separación clara de responsabilidades
- Uso correcto de recursos en XML (`colors.xml`, `strings.xml`, `styles.xml`)
- Interfaces limpias y adaptadas a distintos tamaños de pantalla

## 🛠️ Tecnologías y herramientas utilizadas

- Kotlin
- Android Studio
- Firebase Authentication
- Firebase Firestore
- Firebase Storage
- RecyclerView
- ViewBinding
- Glide (para carga de imágenes)

## 📷 Capturas de pantalla

| Inicio de sesión | Lista de registros | Edición de registro |
|------------------|--------------------|----------------------|
| ![Login](capturas/login.png) | ![Lista](capturas/lista.png) | ![Editar](capturas/editar.png) |

> Asegúrate de colocar las imágenes dentro de una carpeta `/capturas` en tu repositorio.

## 🧪 Pasos seguidos para la implementación

### 🔗 Integración con Firebase
1. Crear el proyecto en [Firebase Console](https://console.firebase.google.com/)
2. Agregar la app Android y descargar `google-services.json`
3. Configurar `build.gradle` con los plugins y dependencias necesarios
4. Activar Firestore, Authentication y Storage en Firebase

### 🛠️ Funcionalidades principales
- **Autenticación**: Uso de `FirebaseAuth` para login y registro
- **CRUD**: Uso de `FirebaseFirestore` para operaciones con documentos
- **Imágenes**: Subida y obtención desde `Firebase Storage`

## 🧩 Estructura del proyecto
