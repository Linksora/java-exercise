git clone git@github.com:Linksora/仓库名

如果报错，可能是校园网屏蔽。可以使用https

git clone https://github.com/Linksora/仓库名

这样clone下来的会有一个新的文件夹，需要进入

cd 仓库名



查看状态

git status

如果on branch main，就是在main分支



加入所有文件

git add .

为本次提交写cmt

git commit -m "my first commit"

push到main分支

git push -u origin main



一次Git生命周期

clone → add → commit → push



标准使用流程

git status

git add .

git commit -m "内容"

git push



平时最好在branch上开发

新建且切换分支

git checkout -b 分支名

开发完

git add .

git commit -m "内容"

git push -u origin 分支名

然后在github上选择Compare & Pull Request