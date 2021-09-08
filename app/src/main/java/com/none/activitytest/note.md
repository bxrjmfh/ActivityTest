# 记录

2021-09-08 12:49:41.043 7967-7967/com.none.activitytest D/MainActivity: onCreat
2021-09-08 12:49:41.193 7967-7967/com.none.activitytest D/MainActivity: onStart
2021-09-08 12:49:41.194 7967-7967/com.none.activitytest D/MainActivity: onResume
在完成程序的启动时打印了以上的log

在点击完成之后显示了以下新的log
2021-09-08 12:52:57.858 8193-8193/com.none.activitytest D/MainActivity: pause
2021-09-08 12:52:58.544 8193-8193/com.none.activitytest D/MainActivity: stop.
表明NormalActivity将MainActivity完全遮挡之后执行了上述方法

按下back之后：
2021-09-08 12:54:53.433 8193-8193/com.none.activitytest D/MainActivity: onRestart
2021-09-08 12:54:53.434 8193-8193/com.none.activitytest D/MainActivity: onStart
2021-09-08 12:54:53.435 8193-8193/com.none.activitytest D/MainActivity: onResume

按下dialog之后：
2021-09-08 13:02:20.463 8368-8368/com.none.activitytest D/MainActivity: pause
没有被完全遮挡，只是进入暂停的状态

按下back
2021-09-08 13:04:16.156 8368-8368/com.none.activitytest D/MainActivity: onResume

退出
2021-09-08 13:05:06.526 8368-8368/com.none.activitytest D/MainActivity: pause
2021-09-08 13:05:07.241 8368-8368/com.none.activitytest D/MainActivity: stop.
(前两个是滑动到任务管理器的时候出现的)
2021-09-08 13:05:11.326 8368-8368/com.none.activitytest D/MainActivity: onDestroy
结束任务后出现