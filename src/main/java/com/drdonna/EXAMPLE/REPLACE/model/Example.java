package com.drdonna.EXAMPLE.REPLACE.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@Component
@Getter
@Setter
public class Example {
    @NotNull(message = "Player Id is mandatory")
    @Id
    private String id;
    
    List<String> gameIds;

    public void addGameId(String gameId)
    {
        if(gameIds == null)
        {
            gameIds = new ArrayList<String>();
        }

        gameIds.add(gameId);
    }

}
