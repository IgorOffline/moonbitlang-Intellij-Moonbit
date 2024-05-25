# Moonbit & WIT for IntelliJ based IDEs

This is a multi-module project containing IntelliJ plugins for multiple languages.

## Modules

### Moonbit Language (`modules/moonbit`)
A [moonbit language](https://github.com/moonbitlang/core) plugin for IntelliJ-based IDEs.
- Supports `*.mbt` and `*.mbti` file extensions

### WIT IDL (`modules/wit`)
A [Wasm Interface Type](https://github.com/WebAssembly/component-model/blob/main/design/mvp/WIT.md) plugin for IntelliJ-based IDEs.
- Supports `*.wit`, `*.wion`, and `*.witx` file extensions

## Build

```bash
# Build all modules
./gradlew build

# Build specific module
./gradlew :modules:moonbit:buildPlugin
./gradlew :modules:wit:buildPlugin
```

## Development

```bash
# Run IDE with all plugins
./gradlew runIde

# Run IDE with specific plugin
./gradlew :modules:moonbit:runIde
./gradlew :modules:wit:runIde
```

## Features

- Semantic Highlight
- Code Formatting (supports `.editorconfig`)
- Structured View
- Language Server Protocol support
