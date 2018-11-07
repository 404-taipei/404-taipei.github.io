### Memo

Build the website and dev in the REPL:

```clojure
clojure -m figwheel.main --build dev --repl
```

Build the production files only.

```clojure
clojure -m figwheel.main --build-once prod
```

Deploy to Github Pages.

```shell
./bin/deploy-to-gh-pages.sh
```

Figwheel Main's documentation: `https://figwheel.org/docs/`
