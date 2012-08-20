This is a sample project which demonstrates a problem with inheritance of java classes inside of a grails app.

To reproduce, run (using Grails 2.1.0)

grails run-app

which should fail with the following stacktrace

| Error 2012-08-20 15:08:55,831 [pool-7-thread-1] ERROR context.GrailsContextLoader  - Error executing bootstraps: java.lang.VerifyError: class test.AbstractFoo overrides final method read.()Ljava/lang/Object;
Message: java.lang.VerifyError: class test.AbstractFoo overrides final method read.()Ljava/lang/Object;
   Line | Method
->> 301 | evaluateEnvironmentSpecificBlock in grails.util.Environment
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
|   294 | executeForEnvironment            in     ''
|   270 | executeForCurrentEnvironment . . in     ''
|   303 | innerRun                         in java.util.concurrent.FutureTask$Sync
|   138 | run . . . . . . . . . . . . . .  in java.util.concurrent.FutureTask
|   886 | runTask                          in java.util.concurrent.ThreadPoolExecutor$Worker
|   908 | run . . . . . . . . . . . . . .  in     ''
^   680 | run                              in java.lang.Thread

Caused by VerifyError: class test.AbstractFoo overrides final method read.()Ljava/lang/Object;
->> 631 | defineClassCond                  in java.lang.ClassLoader
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
|   615 | defineClass                      in     ''
|   141 | defineClass . . . . . . . . . .  in java.security.SecureClassLoader
|   283 | defineClass                      in java.net.URLClassLoader
|    58 | access$000 . . . . . . . . . . . in     ''
|   197 | run                              in java.net.URLClassLoader$1
|   190 | findClass . . . . . . . . . . .  in java.net.URLClassLoader
|   306 | loadClass                        in java.lang.ClassLoader
|   247 | loadClass . . . . . . . . . . .  in     ''
|   631 | defineClassCond                  in     ''
|   615 | defineClass . . . . . . . . . .  in     ''
|   141 | defineClass                      in java.security.SecureClassLoader
|   283 | defineClass . . . . . . . . . .  in java.net.URLClassLoader
|    58 | access$000                       in     ''
|   197 | run . . . . . . . . . . . . . .  in java.net.URLClassLoader$1
|   190 | findClass                        in java.net.URLClassLoader
|   306 | loadClass . . . . . . . . . . .  in java.lang.ClassLoader
|   247 | loadClass                        in     ''
|   169 | forName . . . . . . . . . . . .  in java.lang.Class
|     6 | doCall                           in BootStrap$_closure1
|   301 | evaluateEnvironmentSpecificBlock in grails.util.Environment
|   294 | executeForEnvironment            in     ''
|   270 | executeForCurrentEnvironment . . in     ''
|   303 | innerRun                         in java.util.concurrent.FutureTask$Sync
|   138 | run . . . . . . . . . . . . . .  in java.util.concurrent.FutureTask
|   886 | runTask                          in java.util.concurrent.ThreadPoolExecutor$Worker
|   908 | run . . . . . . . . . . . . . .  in     ''
^   680 | run                              in java.lang.Thread

To show that the AbstractFoo class is usable, run the unit test which invokes it with

grails test-app

You should see

$ grails test-app
| Packaging Grails application.....
| Tests PASSED - view reports in /Users/matt/dev/grails-inheritance-problem/grails-inheritance-problem/target/test-reports
