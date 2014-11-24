package com.blogspot.toomuchcoding.jinkubator.groovy.semantics

import groovy.transform.PackageScope

class MethodScopes {

    void publicByDefault() {}

    private void privateMethod() {}

    protected void protectedMethod() {}

    @PackageScope void packageScopedMethod() {}

}
