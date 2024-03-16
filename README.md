# spring-boot-feature-flag-example

Feature Flag example using Spring Profile.

## Environments

- Visual Studio Code(Dev Containers)
- Java 17
- Maven 3.9.6
- Spring Boot 3.2.3

## Usage

You can launch the server by "Run and Debug" in Visual Studio Code.

You can switch the feature flag by setting Spring Profile([application.yml](src/main/resources/application.yml)) as follows:

- `feat-greeter`: Activate greeter API
- `feat-priority`: Activate Todo list sorting by priority in Todo API

## References

- [Feature Toggles (aka Feature Flags)](https://martinfowler.com/articles/feature-toggles.html)

## License

MIT License

## Author

[toms74209200](<https://github.com/toms74209200>)
