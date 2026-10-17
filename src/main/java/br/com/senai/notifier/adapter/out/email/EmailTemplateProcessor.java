package br.com.senai.notifier.adapter.out.email;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class EmailTemplateProcessor {

    private final TemplateEngine templateEngine;

    /*public String process(String template, Map<String, Object> variables) {
        Context context = new Context();
        variables.forEach(context::setVariable);
        return templateEngine.process(template,context);
    }*/

    /*public void enviarNotificacao(Instrucao instrucao, String acao) {

        List<String> emails = List.of(instrucao.getAluno().getEmail(),instrucao.getInstrutor());
        String assunto = "Nova instrucao" + acao;
        String mensagem = "Uma nova instrução foi" + acao +
                "\nAluno:" + instrucao.getAluno().getNome() +
                "\nInstrutor:" + instrucao.getInstrutor().getNome();

    }*/


}
