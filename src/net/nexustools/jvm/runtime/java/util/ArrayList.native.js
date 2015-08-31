(function(JVM) {
  JVM.ClassLoader.defineNativeImpl("java/util/ArrayList", {
      'init$()V': function($) {
          this.$prop._value = [];
      },
      'add$(Ljava/lang/Object;)Z': function($, obj) {
          this.$prop._value.push(obj);
          return true;
      },
      'get$(I)Ljava/lang/Object;': function($, pos) {
          return this.$prop._value[pos];
      },
      'size$()I': function($) {
          return this.$prop._value.length;
      }
  });
})($currentJVM);