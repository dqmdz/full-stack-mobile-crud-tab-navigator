# Product Management Application

[![Java](https://img.shields.io/badge/Java-24-orange)](https://www.oracle.com/java/)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.21-purple)](https://kotlinlang.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.5-brightgreen)](https://spring.io/projects/spring-boot)
[![Compose Multiplatform](https://img.shields.io/badge/Compose%20Multiplatform-1.6.10-blue)](https://www.jetbrains.com/compose-multiplatform/)
[![Maven](https://img.shields.io/badge/Maven-3.9.4-red)](https://maven.apache.org/)
[![Gradle](https://img.shields.io/badge/Gradle-8.5-green)](https://gradle.org/)
[![H2 Database](https://img.shields.io/badge/H2%20Database-2.1.214-lightgrey)](https://www.h2database.com/)
[![Ktor](https://img.shields.io/badge/Ktor-2.3.7-yellow)](https://ktor.io/)
[![Voyager](https://img.shields.io/badge/Voyager-1.0.0--rc05-orange)](https://github.com/adrielcafe/voyager)

## Description

This project is a comprehensive full-stack application designed for product management. It consists of two main components:

### Backend
A robust RESTful API built with **Spring Boot** following **hexagonal architecture** principles. The backend provides complete CRUD (Create, Read, Update, Delete) operations for product entities, featuring:
- Product creation with validation
- Retrieval of individual products by ID
- Listing all products
- Product updates
- Product deletion
- OpenAPI documentation integration

### Frontend
A cross-platform mobile application developed using **Kotlin Multiplatform** and **Jetpack Compose Multiplatform**. The frontend offers a modern, intuitive user interface with tab-based navigation supporting:
- Product listing with real-time data display
- Product creation form
- Product update functionality
- Product search capabilities

The application is designed to run seamlessly across multiple platforms including **Android**, **iOS**, **Desktop (JVM)**, and **Web (WASM)**, ensuring a consistent user experience regardless of the target platform.

## Architecture

### Backend Architecture
The backend follows **Hexagonal Architecture (Ports and Adapters)** pattern, which promotes:
- **Separation of Concerns**: Clear separation between business logic and external dependencies
- **Testability**: Easy unit testing of core business logic
- **Flexibility**: Ability to change external systems without affecting core logic
- **Maintainability**: Modular structure that facilitates code maintenance and evolution

Key layers:
- **Domain Layer**: Contains business entities and use cases
- **Application Layer**: Orchestrates domain logic and handles cross-cutting concerns
- **Infrastructure Layer**: Implements external interfaces (database, web controllers)

### Frontend Architecture
The frontend leverages **Kotlin Multiplatform** to share business logic across platforms while maintaining platform-specific UI implementations through **Compose Multiplatform**.

## Technologies Used

### Backend
- **Java 24**: Programming language
- **Spring Boot 3.5.5**: Framework for building the REST API
- **Spring Data JPA**: Data access layer
- **H2 Database**: In-memory database for development
- **Spring Validation**: Input validation
- **SpringDoc OpenAPI**: API documentation
- **Lombok**: Code generation
- **Maven**: Build tool

### Frontend
- **Kotlin 1.9.21**: Programming language
- **Compose Multiplatform 1.6.10**: UI framework
- **Ktor 2.3.7**: HTTP client for API communication
- **Voyager**: Navigation library
- **Kotlinx Serialization**: Data serialization
- **Kotlinx Coroutines**: Asynchronous programming
- **Gradle**: Build tool

## Features

- **Cross-Platform Compatibility**: Runs on Android, iOS, Desktop, and Web
- **RESTful API**: Well-designed API endpoints for product management
- **Real-time Data**: Live synchronization between frontend and backend
- **Responsive UI**: Modern Material Design 3 interface
- **Input Validation**: Comprehensive validation on both client and server sides
- **Error Handling**: Robust error handling and user feedback
- **Modular Architecture**: Clean, maintainable codebase following best practices

## Installation and Setup

### Prerequisites
- **Java 24** or higher
- **Kotlin 1.9.21** or higher
- **Maven 3.9+**
- **Gradle 8.5+**
- **Android Studio** (for Android development)
- **Xcode** (for iOS development, macOS only)

### Backend Setup
1. Navigate to the `backend` directory:
   ```bash
   cd backend
   ```

2. Build the project:
   ```bash
   ./mvnw clean install
   ```

3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

The backend will start on `http://localhost:8080` with API documentation available at `http://localhost:8080/swagger-ui.html`.

### Frontend Setup
1. Navigate to the `frontend` directory:
   ```bash
   cd frontend
   ```

2. Build the project:
   ```bash
   ./gradlew build
   ```

#### Running on Different Platforms

**Android:**
```bash
./gradlew :composeApp:installDebug
```

**iOS:**
```bash
./gradlew :composeApp:iosSimulatorArm64
```
*Requires Xcode and macOS*

**Desktop (JVM):**
```bash
./gradlew :composeApp:run
```

**Web (WASM):**
```bash
./gradlew :composeApp:wasmJsBrowserRun
```

## Usage

1. Start the backend server
2. Launch the frontend application on your preferred platform
3. Use the tab navigation to:
   - View all products in the List tab
   - Create new products in the Create tab
   - Update existing products in the Update tab
   - Search for specific products in the Search tab

## API Endpoints

- `GET /products` - Retrieve all products
- `GET /products/{id}` - Retrieve a specific product by ID
- `POST /products` - Create a new product
- `PUT /products/{id}` - Update an existing product
- `DELETE /products/{id}` - Delete a product

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For questions or support, please open an issue in the repository.