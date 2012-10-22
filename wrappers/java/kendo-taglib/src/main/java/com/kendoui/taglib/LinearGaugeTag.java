
package com.kendoui.taglib;


import com.kendoui.taglib.lineargauge.*;



import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class LinearGaugeTag extends WidgetTag /* interfaces *//* interfaces */ {

    public LinearGaugeTag() {
        super("LinearGauge");
    }

    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag
//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public static String tagName() {
        return "linearGauge";
    }

    public void setGaugeArea(GaugeAreaTag value) {
        setProperty("gaugearea", value.properties());
    }

    public void setPointer(PointerTag value) {
        setProperty("pointer", value.properties());
    }

    public void setScale(ScaleTag value) {
        setProperty("scale", value.properties());
    }

    public boolean getTransitions() {
        return (boolean)getProperty("transitions");
    }

    public void setTransitions(boolean value) {
        setProperty("transitions", value);
    }

//<< Attributes

}
