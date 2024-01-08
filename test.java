
Wissen@CND3231J0T MINGW64 ~
$ git -v
git version 2.43.0.windows.1

Wissen@CND3231J0T MINGW64 ~
$ git help
usage: git [-v | --version] [-h | --help] [-C <path>] [-c <name>=<value>]
           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           [--config-env=<name>=<envvar>] <command> [<args>]

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
   clone     Clone a repository into a new directory
   init      Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
   add       Add file contents to the index
   mv        Move or rename a file, a directory, or a symlink
   restore   Restore working tree files
   rm        Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
   bisect    Use binary search to find the commit that introduced a bug
   diff      Show changes between commits, commit and working tree, etc
   grep      Print lines matching a pattern
   log       Show commit logs
   show      Show various types of objects
   status    Show the working tree status

grow, mark and tweak your common history
   branch    List, create, or delete branches
   commit    Record changes to the repository
   merge     Join two or more development histories together
   rebase    Reapply commits on top of another base tip
   reset     Reset current HEAD to the specified state
   switch    Switch branches
   tag       Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
   fetch     Download objects and refs from another repository
   pull      Fetch from and integrate with another repository or a local branch
   push      Update remote refs along with associated objects

'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.
See 'git help git' for an overview of the system.

Wissen@CND3231J0T MINGW64 ~
$ git config --global user.name "preethi.e"

Wissen@CND3231J0T MINGW64 ~
$ git config --global user.email "epreethi21@gmail.com"

Wissen@CND3231J0T MINGW64 ~
$ git init
Initialized empty Git repository in C:/Users/Wissen/.git/

Wissen@CND3231J0T MINGW64 ~ (master)
$ ^C

Wissen@CND3231J0T MINGW64 ~ (master)
$ git clone "https://github.com/Preethi-E/first/tree/main"
Cloning into 'main'...
fatal: repository 'https://github.com/Preethi-E/first/tree/main/' not found

Wissen@CND3231J0T MINGW64 ~ (master)
$ git clone https://github.com/Preethi-E/first/blob/main/firstFile
Cloning into 'firstFile'...
fatal: repository 'https://github.com/Preethi-E/first/blob/main/firstFile/' not found

Wissen@CND3231J0T MINGW64 ~ (master)
$ git clone https://github.com/Preethi-E/first/blob/main/firstFile.git
Cloning into 'firstFile'...
fatal: repository 'https://github.com/Preethi-E/first/blob/main/firstFile.git/' not found

Wissen@CND3231J0T MINGW64 ~ (master)
$ git clone https://github.com/Preethi-E/first/blob/main/firstFile.txt
Cloning into 'firstFile.txt'...
fatal: repository 'https://github.com/Preethi-E/first/blob/main/firstFile.txt/' not found

Wissen@CND3231J0T MINGW64 ~ (master)
$ git clone https://github.com/Preethi-E/first/blob/main/firstFile.txt
Cloning into 'firstFile.txt'...
fatal: repository 'https://github.com/Preethi-E/first/blob/main/firstFile.txt/' not found

Wissen@CND3231J0T MINGW64 ~ (master)
$ git clone https://github.com/Preethi-E/first/main/firstFile.txt
Cloning into 'firstFile.txt'...
remote: Not Found
fatal: repository 'https://github.com/Preethi-E/first/main/firstFile.txt/' not found

Wissen@CND3231J0T MINGW64 ~ (master)
$ git clone https://github.com/Preethi-E/first/firstFile.txt
Cloning into 'firstFile.txt'...
remote: Not Found
fatal: repository 'https://github.com/Preethi-E/first/firstFile.txt/' not found

Wissen@CND3231J0T MINGW64 ~ (master)
$ git clone https://github.com/Preethi-E/firstRepository/tree/main
Cloning into 'main'...
fatal: repository 'https://github.com/Preethi-E/firstRepository/tree/main/' not found

Wissen@CND3231J0T MINGW64 ~ (master)
$ git clone https://github.com/Preethi-E/firstRepository/blob/main/firstFile.txt
Cloning into 'firstFile.txt'...
fatal: repository 'https://github.com/Preethi-E/firstRepository/blob/main/firstFile.txt/' not found

Wissen@CND3231J0T MINGW64 ~ (master)
$ git clone https://github.com/Preethi-E/firstRepository.git
Cloning into 'firstRepository'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (3/3), done.

Wissen@CND3231J0T MINGW64 ~ (master)
$ ^C

Wissen@CND3231J0T MINGW64 ~ (master)
$ git add second.txt
fatal: pathspec 'second.txt' did not match any files

Wissen@CND3231J0T MINGW64 ~ (master)
$ git add second
fatal: pathspec 'second' did not match any files

Wissen@CND3231J0T MINGW64 ~ (master)
$ git add README.md
fatal: pathspec 'README.md' did not match any files

Wissen@CND3231J0T MINGW64 ~ (master)
$ notepad test.java
git add test.java

dir
