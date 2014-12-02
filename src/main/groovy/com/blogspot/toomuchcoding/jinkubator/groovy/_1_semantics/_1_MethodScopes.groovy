package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics

import groovy.transform.PackageScope

class _1_MethodScopes {

    void publicByDefault() {}

    private void privateMethod() {}

    protected void protectedMethod() {}

    @PackageScope void packageScopedMethod() {}

}
