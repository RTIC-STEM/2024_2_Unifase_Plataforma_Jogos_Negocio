package org.serratec.unifase.Unifase_Jogos_Negocio.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Unifase - Jogo de Negócio")
                        .version("1.0.0")
                        .description("API desenvolvida para o curso de Admnistração da Unifase," +
                                " com o objetivo de simular cenários empresarias para os alunos terem uma vivência prática no ramo admnistrativo."))
                .servers(List.of(
                        new Server().url("http://localhost:8080").description("Servidor Local"),
                        new Server().url("https://api.minhaprojeto.com").description("Servidor de Produção")
                ));
    }

}
