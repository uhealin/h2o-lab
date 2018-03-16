package com.uhealin.h2o.airlines;

import java.util.Random;

import com.uhealin.h2o.airlines.pojo.GBM;

import hex.genmodel.GenModel;
import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.exception.PredictException;
import hex.genmodel.easy.prediction.AbstractPrediction;

public class Main {

	public static void main(String[] args) throws PredictException {
		// TODO Auto-generated method stub

        GenModel rawModel=new GBM();
		
		EasyPredictModelWrapper model=new EasyPredictModelWrapper(rawModel);
		
		RowData rd=new RowData();
		
		Random r=new Random();
		
		
		AbstractPrediction predict= model.predict(rd);
		System.out.println(predict.toString());
		
	}

}
