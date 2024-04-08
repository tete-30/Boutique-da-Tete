package br.com.boutiquedatete.boutiqueDaTete.service;

import br.com.boutiquedatete.boutiqueDaTete.model.Lingeries;
import br.com.boutiquedatete.boutiqueDaTete.repository.LingeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LingeriesService {

    @Autowired
    private LingeriesRepository lingeriesRepository;

    public List<Lingeries> findAll() {
        return lingeriesRepository.findAll();
    }



}
