This is a Play project which screws up the SBT console when you run sbt's test command. To reproduce the problem, run `sbt` to open the SBT console. Then run `test`. The problem appears to be caused by a race condition and thus you must run the `test` command numerous times. To rerun `test` simply press the up arrow on your keyboard followed by enter in order to rerun the last command.

The console prompt should reappear when the tests have finished running:

    [success] Total time: 0 s, completed Oct 30, 2014 5:34:15 PM
    >

However, due to this bug, often times you won't see the prompt appear after the tests have run:

    [success] Total time: 0 s, completed Oct 30, 2014 5:41:37 PM
