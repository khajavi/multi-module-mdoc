
# Multi-Module MDoc

This simple repo, shows how to have multi-module mdocs that each module can have its own set of dependencies:

```bash
documentation/
├── zio-docs-bar-tutorial
│   └── docs
|        └── bar-tutorial.md
└── zio-docs-foo-tutorial
    └── docs
         └── foo-tutorial.md
```

To build documentations:

```bash
$ sbt mdoc
```

Generated files:

```scala
website/
└── docs
    ├── bar-tutorial.md
    └── foo-tutorial.md
```