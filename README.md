Proyecto 1 (Actualizado): App de Notas con Jetpack Compose
==========================================================

**Objetivo:**

*   Practicar **UI declarativa** con Compose.

*   Usar **MVVM** + **Room** para persistencia local.

*   Implementar **login y registro**.


Funcionalidades principales:
----------------------------

1.  **Login / Registro de usuario**:

    *   Registro: email + contraseña (guardada en Room o DataStore).

    *   Login: validación de credenciales.

    *   Persistencia de sesión.

2.  **Notas**:

    *   Crear, editar y eliminar notas.

    *   Listado con LazyColumn.

    *   Buscar y filtrar notas por título.

3.  **Extras de Compose**:

    *   Scaffold con TopAppBar.

    *   Tarjetas para mostrar notas (Card).

    *   Animaciones simples (fade/slide al agregar o eliminar).


Flujo de trabajo:
-----------------

1.  Abrir app → SplashScreen o chequeo de sesión.

2.  Si no hay usuario logueado → LoginScreen.

3.  Usuario nuevo → RegisterScreen.

4.  Login exitoso → navegar a NotesListScreen.

5.  Crear/editar nota → NoteDetailScreen.

6.  Listado actualizado automáticamente gracias a ViewModel y StateFlow.


Estructura de directorios (MVVM + Compose):
-------------------------------------------

```bash
app/
 ├── data/
 │   ├── model/           # Note.kt, User.kt
 │   ├── dao/             # NoteDao.kt, UserDao.kt
 │   ├── database/        # AppDatabase.kt
 │   └── repository/      # NoteRepository.kt, UserRepository.kt
 ├── domain/
 │   └── usecase/         # AddNote.kt, DeleteNote.kt, LoginUser.kt, RegisterUser.kt
 ├── presentation/
 │   ├── login/           # LoginViewModel.kt + LoginScreen.kt
 │   ├── register/        # RegisterViewModel.kt + RegisterScreen.kt
 │   ├── notes/           # NotesViewModel.kt + NotesListScreen.kt, NoteDetailScreen.kt
 │   └── session/         # SessionManager.kt
 ├── ui/
 │   ├── theme/           # Colors, Typography, Shapes
 │   └── components/      # Reusable composables (NoteCard, TextFieldCustom)
 └── utils/               # Extensiones, helpers, validation

```

Roadmap de implementación (Jetpack Compose)
-------------------------------------------

**Duración estimada: 3 semanas**

### Semana 1: Estructura + Login/Registro

1.  Crear proyecto Android con Kotlin + Compose.

2.  Configurar Room (User + Note).

3.  Implementar RegisterScreen + LoginScreen con navegación Compose.

4.  ViewModel para login/registro + persistencia de sesión (DataStore o Room).


### Semana 2: Notas

1.  Implementar modelo Note + DAO + Repository.

2.  Crear NotesViewModel con StateFlow.

3.  Pantalla NotesListScreen con LazyColumn.

4.  NoteDetailScreen para crear/editar nota.


### Semana 3: Extras + Pulido

1.  Implementar búsqueda y filtrado de notas.

2.  Animaciones al agregar/eliminar.

3.  Mejorar UI: tema, colores, tipografía.

4.  Testing básico de ViewModel y DAO.