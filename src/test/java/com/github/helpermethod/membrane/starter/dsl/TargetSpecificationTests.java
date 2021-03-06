package com.github.helpermethod.membrane.starter.dsl;

import com.predic8.membrane.core.rules.AbstractServiceProxy.Target;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A TargetSpecification")
public class TargetSpecificationTests {
    private Target target;
    private TargetSpecification targetSpecification;

    @BeforeEach
    public void setUp() {
        target = new Target();
        targetSpecification = new TargetSpecification(target);
    }

    @DisplayName("should set the host on the target")
    @Test
    public void testSetHost() {
        targetSpecification.host("localhost");

        assertThat(target.getHost()).isEqualTo("localhost");
    }

    @DisplayName("should set the port on the target")
    @Test
    public void testSetPort() {
        targetSpecification.port(8080);

        assertThat(target.getPort()).isEqualTo(8080);
    }
}