/**
 *
 * Copyright 2008-2009 Elements. All Rights Reserved.
 *
 * License version: CPAL 1.0
 *
 * The Original Code is glowaxes.org code. Please visit glowaxes.org to see how
 * you can contribute and improve this software.
 *
 * The contents of this file are licensed under the Common Public Attribution
 * License Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *    http://glowaxes.org/license.
 *
 * The License is based on the Mozilla Public License Version 1.1.
 *
 * Sections 14 and 15 have been added to cover use of software over a computer
 * network and provide for attribution determined by Elements.
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 *
 * Elements is the Initial Developer and the Original Developer of the Original
 * Code.
 *
 * The contents of this file may be used under the terms of the Elements 
 * End-User License Agreement (the Elements License), in which case the 
 * provisions of the Elements License are applicable instead of those above.
 *
 * You may wish to allow use of your version of this file under the terms of
 * the Elements License please visit http://glowaxes.org/license for details.
 *
 */

package glowaxes.tags;

import javax.servlet.jsp.JspTagException;

// TODO: Auto-generated Javadoc
/**
 * The Class YAxisTag.
 */
public class YAxisTag extends AbstractAxisTag {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1241339168364967021L;

    // Tag interface
    // -------------------------------------------------------------------------
    /*
     * Override: Call the default TagSupport constructor.
     */
    /**
     * Instantiates a new y axis tag.
     */
    public YAxisTag() {
        super();

    }

    /*
     * Override: The method below will use the PageContext to get a JspWriter
     * class. It will then use this Writer to write a message to the encapsuling
     * JSP page. As the SupportTag has implemented a doStartTag() method that
     * returns SKIP_BODY, we do not need to implement that or any other method
     * that we don't want to override.
     */
    /*
     * (non-Javadoc)
     * 
     * @see glowaxes.tags.AbstractAxisTag#doEndTag()
     */
    public int doEndTag() throws JspTagException {

        AreaTag areaTag = (AreaTag) findAncestorWithClass(this, AreaTag.class);
        if (areaTag == null) {
            throw new JspTagException(
                    "<ga:yaxis> tag must be within a <ga:area> tag");
        } else {
            areaTag.setAttribute("yaxis", axisAttributes);
        }

        return EVAL_PAGE;
    }

}
