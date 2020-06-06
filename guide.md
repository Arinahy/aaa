使用命令行，切换到工作目录。

下载远程仓库：

```
git clone https://github.com/Nugine/LiteratureManagementSystem.git
cd LiteratureManagementSystem
git status
```

此时应该看到已经是最新的提示。

创建一个属于自己的分支：

```
git branch yourname
```

yourname 替换成自己的用户名，或其他有意义的名称。

写代码，做些修改，然后查看状态：

```
git status
```

```
位于分支 nugine
您的分支与上游分支 'origin/nugine' 一致。

未跟踪的文件:
  （使用 "git add <文件>..." 以包含要提交的内容）

        guide.md

提交为空，但是存在尚未跟踪的文件（使用 "git add" 建立跟踪）
```

跟踪所有已修改的文件：

```
git add -A
```

```
位于分支 nugine
您的分支与上游分支 'origin/nugine' 一致。

要提交的变更：
  （使用 "git reset HEAD <文件>..." 以取消暂存）

        新文件：   guide.md
```

提交修改：

```
git commit -m "提交说明"
```

提交说明 替换成对本次提交的简要描述

推送到远程仓库：

```
git push -u origin yourname
```

yourname 替换成当前分支名。

