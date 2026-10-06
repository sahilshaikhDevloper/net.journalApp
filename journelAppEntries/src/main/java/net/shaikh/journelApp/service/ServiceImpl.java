package net.shaikh.journelApp.service;

import lombok.RequiredArgsConstructor;
import net.shaikh.journelApp.Entity.JournelEntity;
import net.shaikh.journelApp.Entity.JournelModule;
import net.shaikh.journelApp.ExceptionHandler.GlobalException;
import net.shaikh.journelApp.repository.RepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServiceImpl implements ServiceInterface{

    private final RepositoryInterface repositoryInterface;
    @Override
    public List<JournelEntity> getAllProduct() {
        return repositoryInterface.findAll();
    }

    @Override
    public JournelModule PostJournel(JournelEntity entity){
        JournelEntity entity1 = repositoryInterface.save(entity);
        entity1.setTitle(entity.getTitle());
        entity1.setContent(entity.getContent());
        entity1.setId(entity.getId());

        JournelModule saved = new JournelModule();
        saved.setContent(entity1.getContent());
        saved.setTitle(entity1.getTitle());
        saved.setId(entity1.getId());
        return saved;
    }

    @Override
    public JournelModule GetbyId(String entity) {
        JournelEntity entity1 = repositoryInterface.findById(entity).
                orElseThrow(() -> new GlobalException("id not found"));

        JournelModule module = new JournelModule();
        module.setTitle(entity1.getTitle());
        module.setContent(entity1.getContent());
        module.setId(entity1.getId());

        return module;
    }

    @Override
    public JournelModule updateJournel(JournelEntity entity) {
        JournelEntity entity1 = repositoryInterface.findById(entity.getId()).
        orElseThrow(()->new GlobalException("id not found"));
        JournelModule module = new JournelModule();

        if (entity.getContent()!=null){
            entity1.setContent(entity.getContent());
        }
        if (entity.getTitle()!=null){
            entity1.setTitle(entity.getTitle());
        }
        module.setContent(entity1.getContent());
        module.setTitle(entity.getTitle());
        module.setId(entity.getId());
        return module;
    }
    @Override
    public String DeleteJournel(String  entity){
        JournelEntity entity1 = repositoryInterface.findById(entity).
                orElseThrow(()->new GlobalException("id not found"));

        if (entity.equals(entity1.getId())) {
            repositoryInterface.deleteById(entity);
        }
        return "Deleted successfully";
    }
}
