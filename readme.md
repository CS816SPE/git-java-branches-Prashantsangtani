prashant@dell:~/Desktop/calc$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	cal.class
	cal.java

nothing added to commit but untracked files present (use "git add" to track)
prashant@dell:~/Desktop/calc$ git add .
prashant@dell:~/Desktop/calc$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   cal.class
	new file:   cal.java

prashant@dell:~/Desktop/calc$ git commit -m "addition module"
[master (root-commit) fa312ac] addition module
 2 files changed, 32 insertions(+)
 create mode 100644 cal.class
 create mode 100644 cal.java
prashant@dell:~/Desktop/calc$ git remote add origin https://github.com/Prashantsangtani/calc.git
prashant@dell:~/Desktop/calc$ git push -u origin master
Username for 'https://github.com': Prashantsangtani
Password for 'https://Prashantsangtani@github.com': 
Counting objects: 4, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 1.28 KiB | 1.28 MiB/s, done.
Total 4 (delta 0), reused 0 (delta 0)
To https://github.com/Prashantsangtani/calc.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.
prashant@dell:~/Desktop/calc$ git branch submodule
prashant@dell:~/Desktop/calc$ git branch
* master
  submodule
prashant@dell:~/Desktop/calc$ git checkout submodule
Switched to branch 'submodule'
prashant@dell:~/Desktop/calc$ git branch
  master
* submodule
prashant@dell:~/Desktop/calc$ git status
On branch submodule
nothing to commit, working tree clean
prashant@dell:~/Desktop/calc$ javac cal.java
prashant@dell:~/Desktop/calc$ java cal
1, Add two no.s
2, Sub two no.s
3. Exit

Enter ur choice
2
Enter 2 nos.2
2
Result =0.0
----------------------1, Add two no.s
2, Sub two no.s
3. Exit

Enter ur choice
3
prashant@dell:~/Desktop/calc$ git add .
prashant@dell:~/Desktop/calc$ git commit -m "sub module"
[submodule 2561a76] sub module
 2 files changed, 11 insertions(+), 3 deletions(-)
 rewrite cal.class (65%)
prashant@dell:~/Desktop/calc$ git push -u origin submodule
Username for 'https://github.com': Prashantsangtani
Password for 'https://Prashantsangtani@github.com': 
Counting objects: 4, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 1.13 KiB | 1.13 MiB/s, done.
Total 4 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'submodule' on GitHub by visiting:
remote:      https://github.com/Prashantsangtani/calc/pull/new/submodule
remote: 
To https://github.com/Prashantsangtani/calc.git
 * [new branch]      submodule -> submodule
Branch 'submodule' set up to track remote branch 'submodule' from 'origin'.
prashant@dell:~/Desktop/calc$ git merge submodule
Already up to date.
prashant@dell:~/Desktop/calc$ git checkout master
Switched to branch 'master'
Your branch is up to date with 'origin/master'.
prashant@dell:~/Desktop/calc$ git merge submodule
Updating fa312ac..2561a76
Fast-forward
 cal.class | Bin 1239 -> 1350 bytes
 cal.java  |  14 +++++++++++---
 2 files changed, 11 insertions(+), 3 deletions(-)
prashant@dell:~/Desktop/calc$ git diff master..submodule
prashant@dell:~/Desktop/calc$ git status
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean
prashant@dell:~/Desktop/calc$ git push -u origin master
Username for 'https://github.com': Prashantsangtani
Password for 'https://Prashantsangtani@github.com': 
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/Prashantsangtani/calc.git
   fa312ac..2561a76  master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.
prashant@dell:~/Desktop/calc$ git diff master..submodule
prashant@dell:~/Desktop/calc$ git diff master..submodule
prashant@dell:~/Desktop/calc$ git diff master.submodule
fatal: ambiguous argument 'master.submodule': unknown revision or path not in the working tree.
Use '--' to separate paths from revisions, like this:
'git <command> [<revision>...] -- [<file>...]'
prashant@dell:~/Desktop/calc$ git diff master..submodule
prashant@dell:~/Desktop/calc$ git remote set-url origin https://github.com/CS816SPE/git-java-branches-Prashantsangtani.git
prashant@dell:~/Desktop/calc$ git push -u origin master
Username for 'https://github.com': Prashantsangtani
Password for 'https://Prashantsangtani@github.com': 
Counting objects: 8, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (8/8), 2.34 KiB | 798.00 KiB/s, done.
Total 8 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), done.
To https://github.com/CS816SPE/git-java-branches-Prashantsangtani.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.
prashant@dell:~/Desktop/calc$ git checkout submodule
Switched to branch 'submodule'
Your branch is up to date with 'origin/submodule'.
prashant@dell:~/Desktop/calc$ git push -u origin master
Username for 'https://github.com': Prasahntsangtani
Password for 'https://Prasahntsangtani@github.com': 
remote: Invalid username or password.
fatal: Authentication failed for 'https://github.com/CS816SPE/git-java-branches-Prashantsangtani.git/'
prashant@dell:~/Desktop/calc$ git push -u origin submodule
Username for 'https://github.com': Prashantsangtani
Password for 'https://Prashantsangtani@github.com': 
Total 0 (delta 0), reused 0 (delta 0)
remote: 
remote: Create a pull request for 'submodule' on GitHub by visiting:
remote:      https://github.com/CS816SPE/git-java-branches-Prashantsangtani/pull/new/submodule
remote: 
To https://github.com/CS816SPE/git-java-branches-Prashantsangtani.git
 * [new branch]      submodule -> submodule
Branch 'submodule' set up to track remote branch 'submodule' from 'origin'.
prashant@dell:~/Desktop/calc$ 

