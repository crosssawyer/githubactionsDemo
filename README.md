# GitHub Actions and Testing

To start, create a copy of this repo (either fork or use the template)

This is based on the [GitHub Actions Quickstart Guide](https://docs.github.com/en/actions/quickstart).

Create in the repository (including the parent directories) a file named `.github/workflows/runtests.yml` with the following contents:

```yaml
name: Run JUnit Tests (Gradle)
on: [push]
jobs:
  build:
    name: Run Tests
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - uses: actions/setup-java@v1
        with:
          java-version: '11'
      - name: Run Tests
        run: gradle clean test
```
