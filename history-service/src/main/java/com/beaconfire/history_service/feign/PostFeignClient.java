package com.beaconfire.history_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.beaconfire.history_service.dto.DataResponse;

@FeignClient(name = "POSTS-SERVICE", path = "/posts")
public interface PostFeignClient {
    @GetMapping("/{postId}")
    DataResponse getPostById(@PathVariable("postId") String postId);
}