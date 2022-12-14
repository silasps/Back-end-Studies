package com.example.caderno.controller;

import com.example.caderno.dataProvider.repository.AssuntoRepository;
import com.example.caderno.dataProvider.repository.PerguntaRepository;
import com.example.caderno.dataProvider.repository.RespostaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assunto")
public class RespostaController {

    private final AssuntoRepository assuntoRepository;

    private final PerguntaRepository perguntaRepository;

    private RespostaRepository respostaRepository;

    public RespostaController(AssuntoRepository assuntoRepository, PerguntaRepository perguntaRepository, RespostaRepository respostaRepository){
        this.assuntoRepository = assuntoRepository;
        this.perguntaRepository = perguntaRepository;
        this.respostaRepository = respostaRepository;
    }

}
