# se usara la rama default al inicializar nuevos repositorios
git config --global --unset init.defaultBranch

# ayuda a manejar conflictos merge o rebase(false)
git config --global --unset rerere.enabled

git config --add --global user.name "user"
git config --add --global user.email "email"

# muestra los commits y añade info al archivo
git log --graph --decorate > out
git log --graph --oneline

# usar los del dir /.git/objects
git cat-file -p sha

# --local --global
git config --add fem.dev "amazing"

git config --list
git config --get

# cambio de rama
git checkout branch
