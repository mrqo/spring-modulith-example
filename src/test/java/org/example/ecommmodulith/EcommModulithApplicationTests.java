package org.example.ecommmodulith;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;
import org.springframework.modulith.test.ApplicationModuleTest;

import static org.assertj.core.api.Assertions.assertThat;


@ApplicationModuleTest
class EcommModulithApplicationTests {
    ApplicationModules modules = ApplicationModules.of(EcommModulithApplication.class);

    @Test
    void modulesShouldBeCompliant() {
        modules.verify();
    }

    @Test
    void moduleOrderShouldRespectBoundaries() {
        assertThat(modules.getModuleByName("order").isPresent()).isTrue();
    }

    @Test
    void createModuleDocumentation() {
        new Documenter(modules)
            .writeModulesAsPlantUml()
            .writeIndividualModulesAsPlantUml()
            .writeModuleCanvases();
    }
}
