(function(JVM) {
  JVM.ClassLoader.defineNativeImpl("java/util/ArrayList", {
      'add$(Ljava/lang/Object;)Z': function($, obj) {
          this.$prop.elementData.push(obj);
          return true;
      },
      'get$(I)Ljava/lang/Object;': function($, pos) {
          return this.$prop.elementData[pos];
      },
      'size$()I': function($) {
          return this.$prop.elementData.length;
      }
  });
})($currentJVM);