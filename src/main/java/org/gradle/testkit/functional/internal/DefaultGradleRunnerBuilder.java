package org.gradle.testkit.functional.internal;

import org.gradle.testkit.functional.GradleRunner;
import org.gradle.testkit.functional.GradleRunnerBuilder;
import org.gradle.testkit.functional.internal.handle.ClasspathInjectingGradleHandleFactory;
import org.gradle.testkit.functional.internal.handle.ToolingApiGradleHandleFactory;

public class DefaultGradleRunnerBuilder extends GradleRunnerBuilder {

    private final DefaultClasspathSpec classpath = new DefaultClasspathSpec();

    @Override
    public GradleRunner build() {
        return new DefaultGradleRunner(
                new ClasspathInjectingGradleHandleFactory(classpath, new ToolingApiGradleHandleFactory())
        );
    }

    public DefaultClasspathSpec getClasspath() {
        return classpath;
    }
}
