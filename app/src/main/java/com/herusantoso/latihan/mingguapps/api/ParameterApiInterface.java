package com.herusantoso.latihan.mingguapps.api;

import com.herusantoso.latihan.mingguapps.model.ResultMessage;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by santoso on 5/6/18.
 */

public interface ParameterApiInterface {

    @Headers("Content-Type: application/json")
    @GET("digital_raport/parameter/get-semester.php")
    Call<ResultMessage> getSemester();
}
