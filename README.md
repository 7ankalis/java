### Setting up

```
rm -rf .git              
git init -b main          
git add .
git commit -m "Initial commit"

gh repo create java --public --source=. --remote=origin --push
```

#### Compiling
`javac *java`
