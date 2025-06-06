package com.example.mission7.web.controller;

import com.example.mission7.apiPayload.ApiResponse;
import com.example.mission7.converter.TempConverter;
import com.example.mission7.service.tempQueryService.TempQueryService;
import com.example.mission7.web.dto.TempResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TempRestController {
    private final TempQueryService tempQueryService;
    public TempRestController(@Qualifier("tempQueryServiceImpl") TempQueryService tempQueryService) {
        this.tempQueryService = tempQueryService;
    }
    @GetMapping("/test")
    public ApiResponse<TempResponse.TempTestDTO> testAPI(){

        return ApiResponse.onSuccess(TempConverter.toTempTestDTO());
    }

    @GetMapping("/exception")
    public ApiResponse<TempResponse.TempExceptionDTO> exceptionAPI(@RequestParam Integer flag){
        tempQueryService.CheckFlag(flag);
        return ApiResponse.onSuccess(TempConverter.toTempExceptionDTO(flag));
    }
}
