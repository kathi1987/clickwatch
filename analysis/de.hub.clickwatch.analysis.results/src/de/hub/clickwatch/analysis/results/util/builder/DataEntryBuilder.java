
      package de.hub.clickwatch.analysis.results.util.builder;
      
      /**
       * <!-- begin-user-doc --> 
       *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.DataEntry</b></em>'.
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      public class DataEntryBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.DataEntry> {
      
        // features and builders
        
  private 
   
    java.lang.String
  
 m_name;
  

        
  private java.util.Collection<
   
    Double
  
> m_values = new java.util.LinkedList<
   
Double
  
>();
  

        
        // helper attributes
        
  private boolean m_featureNameSet = false;

  private boolean m_featureValuesSet = false;
        
      
        /**
         * Builder is not instantiated with a constructor.
         * @see #newDataEntryBuilder()
         */ 
        private DataEntryBuilder() {
        }
        
        /**
         * This method creates a new instance of the DataEntryBuilder.
         * @return new instance of the DataEntryBuilder
         */
        public static DataEntryBuilder newDataEntryBuilder() {
          return new DataEntryBuilder();
        }
        
        /**
         * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
         */
        public DataEntryBuilder but() {
          
            DataEntryBuilder _builder = newDataEntryBuilder();        
            
  _builder.m_featureNameSet = m_featureNameSet;
  _builder.m_name = m_name;
  

  _builder.m_featureValuesSet = m_featureValuesSet;
  _builder.m_values = m_values;
  
           
            return _builder;
                      
        }
        
        /**
         * This method constructs the final de.hub.clickwatch.analysis.results.DataEntry type.
         * @return new instance of the de.hub.clickwatch.analysis.results.DataEntry type
         */
        public de.hub.clickwatch.analysis.results.DataEntry build() {
          
            final de.hub.clickwatch.analysis.results.DataEntry _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createDataEntry();            
            
  if(m_featureNameSet) {
    _newInstance.setName(m_name);     
  
  }
  

            
  if(m_featureValuesSet) {    
    _newInstance.getValues().addAll(m_values);        
  
  }
  
            
            return _newInstance;
          
        }    
        
          
  public DataEntryBuilder withName(
   
    java.lang.String
  
 p_name){
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

    

         
  public DataEntryBuilder withValues(
   
    double
  
 p_values){
    m_values.add(p_values);
    m_featureValuesSet = true;
    return this;
  }    

  public DataEntryBuilder withValues(java.util.Collection<? extends 
   
		  Double
  
> p_values){
    m_values.addAll(p_values);
    m_featureValuesSet = true;
    return this;
  }

    

      }
    