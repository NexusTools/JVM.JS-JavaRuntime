(function(JVM, clazz) {
    $currentJVM.ClassLoader.defineNativeImpl("net/nexustools/jvm/bridge/JSConsoleWriter", {
        'init$(Ljava/lang/String;)V': function ConsoleWriter$init($, type) {
            this.$native.out = console[type.$prop._value].bind(console);
        },
        'append$(Ljava/lang/String;)V': function ConsoleWriter$append($, line) {
            this.$native.out((line && line.$prop._value) || null);
        }
    });
})();