[TOC]

# Android

---

## 一、Android进程与线程 
[Android进程与线程](http://www.cnblogs.com/cqumonk/p/4828616.html)

[Android进程与线程基本知识](http://www.cnblogs.com/hanyonglu/archive/2012/04/12/2443262.html)

进程是由系统所创建的，但内存不足的时候，又会被系统所回收。      
进程的级别
> * Foreground Process
> * Visible Process
> * Service Process
> * Background Process
> * Empty Process

进程回收   

- 5---1 回收
- 先回收一个，够了不再回收
- 特殊回收 3 2 1
>内存不够，回收三种线程，内存够了，会自动重启  
>如果用户手动关闭了服务，服务不会重启


## 二、Android清单文件、四大组件、常用的布局文件
### 1 清单文件、备份
[专栏：Android清单文件详解](http://blog.csdn.net/column/details/androidmanifest.html)

### 2 四大组件
四大组件
>Activity
>BroadcastReceiver
>ContentProvider
>Service

#### 2.1 Activity
##### a 启动模式
>Standard
>SingleTop
>SingleTask
>SingleInstance

##### b 启动方式


##### c 生命周期

##### d 能够传递的类型


### 3 常用的布局文件