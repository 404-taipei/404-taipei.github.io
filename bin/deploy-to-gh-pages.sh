#!/bin/sh

# Deletes all the content of the target directory.
rm -rf target/

# Compiles the clojurescript for production.
clojure -m figwheel.main --build-once prod

# Makes the target/gh-pages directory.
mkdir -p target/gh-pages

# Copies all the resources inside.
cp -r resources/public/* target/gh-pages/

# Copies and renames the javascript file so it can be found from the html file.
mkdir -p target/gh-pages/cljs-out/
cp target/public/cljs-out/prod-main.js target/gh-pages/cljs-out/dev-main.js

# Creates the git repository.
cd target/gh-pages
git init
git remote add origin git@github.com:404-taipei/404-taipei.github.io.git

# Commits the production files and force push to master branch.
git add .
git commit -m "Github Pages force push."
git push -f --set-upstream origin master
