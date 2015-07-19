(function() {
    $currentJVM.ClassLoader.defineNativeImpl("java/lang/System", {
        'currentTimeMillis$()J': function($) {
            return +new Date;
        }
    });
})();