package com.uhealin.h2o.seeds.pojo;


/*
 
 Licensed under the Apache License, Version 2.0
    http://www.apache.org/licenses/LICENSE-2.0.html

  AUTOGENERATED BY H2O at 2018-03-16T14:46:30.416+08:00
  3.19.0.4224
  
  Standalone prediction code with sample test data for KMeansModel named KMeans

  How to download, compile and execute:
      mkdir tmpdir
      cd tmpdir
      curl http://192.168.0.125:54323/3/h2o-genmodel.jar > h2o-genmodel.jar
      curl http://192.168.0.125:54323/3/Models.java/KMeans > KMeans.java
      javac -cp h2o-genmodel.jar -J-Xmx2g -J-XX:MaxPermSize=128m KMeans.java

     (Note:  Try java argument -XX:+PrintCompilation to show runtime JIT compiler behavior.)
*/
import java.util.Map;
import hex.genmodel.GenModel;
import hex.genmodel.annotations.ModelPojo;
import hex.genmodel.IClusteringModel;

@ModelPojo(name="KMeans", algorithm="kmeans")
public class KMeans extends GenModel implements IClusteringModel {
  public hex.ModelCategory getModelCategory() { return hex.ModelCategory.Clustering; }

  // Names of columns used by model.
  public static final String[] NAMES = NamesHolder_KMeans.VALUES;

  // Column domains. The last array contains domain of response column.
  public static final String[][] DOMAINS = new String[][] {
    /* C1 */ null,
    /* C2 */ null,
    /* C3 */ null,
    /* C4 */ null,
    /* C5 */ null,
    /* C6 */ null,
    /* C8 */ null
  };

  public KMeans() { super(NAMES,DOMAINS,null); }
  public String getUUID() { return Long.toString(4637710489323912160L); }

  // Pass in data in a double[], pre-aligned to the Model's requirements.
  // Jam predictions into the preds[] array; preds[0] is reserved for the
  // main prediction (class for classifiers or value for regression),
  // and remaining columns hold a probability distribution for classifiers.
  public final double[] score0( double[] data, double[] preds ) {
    preds[0] = KMeans_closest(KMeans_CENTERS.VALUES,data, DOMAINS);
    return preds;
  }

  // Pass in data in a double[], in a same way as to the score0 function.
  // Cluster distances will be stored into the distances[] array. Function
  // will return the closest cluster. This way the caller can avoid to call
  // score0(..) to retrieve the cluster where the data point belongs.
  public final int distances( double[] data, double[] distances ) {
    int cluster = KMeans_distances(KMeans_CENTERS.VALUES,data, DOMAINS, distances);
    return cluster;
  }

  // Returns number of cluster used by this model.
  public final int getNumClusters() {
    int nclusters = KMeans_CENTERS.VALUES.length;
    return nclusters;
  }
}
// The class representing training column names
class NamesHolder_KMeans implements java.io.Serializable {
  public static final String[] VALUES = new String[7];
  static {
    NamesHolder_KMeans_0.fill(VALUES);
  }
  static final class NamesHolder_KMeans_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "C1";
      sa[1] = "C2";
      sa[2] = "C3";
      sa[3] = "C4";
      sa[4] = "C5";
      sa[5] = "C6";
      sa[6] = "C8";
    }
  }
}
// Denormalized cluster centers[K][features]
class KMeans_CENTERS implements java.io.Serializable {
  public static final double[][] VALUES = new double[3][];
  static {
    KMeans_CENTERS_0.fill(VALUES);
  }
  static class KMeans_CENTERS_0_0 implements java.io.Serializable {
    public static final double[] VALUES = new double[7];
    static {
      KMeans_CENTERS_0_0_0.fill(VALUES);
    }
    static final class KMeans_CENTERS_0_0_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = 18.721803278688522;
        sa[1] = 16.297377049180326;
        sa[2] = 0.8850868852459014;
        sa[3] = 6.208934426229506;
        sa[4] = 3.7226721311475406;
        sa[5] = 3.603590163934426;
        sa[6] = 1.9836065573770492;
      }
    }
}
  static class KMeans_CENTERS_0_1 implements java.io.Serializable {
    public static final double[] VALUES = new double[7];
    static {
      KMeans_CENTERS_0_1_0.fill(VALUES);
    }
    static final class KMeans_CENTERS_0_1_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = 11.909066666666666;
        sa[1] = 13.25026666666667;
        sa[2] = 0.8515493333333337;
        sa[3] = 5.222333333333332;
        sa[4] = 2.8650933333333337;
        sa[5] = 4.7221866666666665;
        sa[6] = 2.8666666666666667;
      }
    }
}
  static class KMeans_CENTERS_0_2 implements java.io.Serializable {
    public static final double[] VALUES = new double[7];
    static {
      KMeans_CENTERS_0_2_0.fill(VALUES);
    }
    static final class KMeans_CENTERS_0_2_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = 14.632027027027021;
        sa[1] = 14.45324324324324;
        sa[2] = 0.8790972972972971;
        sa[3] = 5.561783783783783;
        sa[4] = 3.2748918918918926;
        sa[5] = 2.744043243243243;
        sa[6] = 1.135135135135135;
      }
    }
}
  static final class KMeans_CENTERS_0 implements java.io.Serializable {
    static final void fill(double[][] sa) {
      sa[0] = KMeans_CENTERS_0_0.VALUES;
      sa[1] = KMeans_CENTERS_0_1.VALUES;
      sa[2] = KMeans_CENTERS_0_2.VALUES;
    }
  }
}
