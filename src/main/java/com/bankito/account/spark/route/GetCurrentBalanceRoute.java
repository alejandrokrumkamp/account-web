package com.bankito.account.spark.route;

import java.util.Optional;

import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.MimeTypes;

import spark.Request;
import spark.Response;
import spark.Route;

import com.bankito.account.data.MovementRepository;
import com.bankito.account.entity.Balance;
import com.bankito.account.spark.WebApp;

public class GetCurrentBalanceRoute implements Route {

  private final MovementRepository movements;
	
  public GetCurrentBalanceRoute(MovementRepository movements) {
	    this.movements = movements;
	  }

  @Override
  public Object handle(Request request, Response response) throws Exception {
	Optional<Balance> balance = movements.getBalance(request.params("id"));
    response.status(HttpStatus.OK_200);
    response.type(MimeTypes.Type.APPLICATION_JSON_UTF_8.toString());
    return WebApp.gson.toJson(balance.get());
  }
  
}
