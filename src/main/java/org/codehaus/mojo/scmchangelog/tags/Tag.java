/*
The MIT License

Copyright (c) 2004, The Codehaus

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
of the Software, and to permit persons to whom the Software is furnished to do
so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package org.codehaus.mojo.scmchangelog.tags;

import java.util.Date;

/**
 * Represents a tag in the subversion repository.
 * @author ehsavoie
 * @version $Id$
 */
public class Tag
    implements Comparable
{

  private String author;
  private Date date;
  private String title;
  private String startRevision;
  private String endRevision;

  /**
   * Creates a new instance of Tag.
   * @param title the name of the tag.
   */
  public Tag( String title )
  {
    this.title = title;
  }

  /**
   * Return the name of the tag.
   * @return the name of the tag.
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * Return the starting revision for this tag.
   * @return the starting revision for this tag.
   */
  public String getStartRevision()
  {
    return startRevision;
  }

  /**
   * Set the starting revision for this tag.
   * @param startRevision the starting revision for this tag.
   */
  public void setStartRevision( String startRevision )
  {
    this.startRevision = startRevision;
  }

  /**
   * Return the end revision for this tag.
   * @return the end revision for this tag.
   */
  public String getEndRevision()
  {
    return endRevision;
  }

  /**
   * Set the end revision for this tag.
   * @param endRevision the end revision for this tag.
   */
  public void setEndRevision( String endRevision )
  {
    this.endRevision = endRevision;
  }

  /**
   * Return the date of the creation of this tag.
   * @return the date of the creation of this tag.
   */
  public Date getDate()
  {
    return date;
  }

  /**
   * Set the date of the creation of this tag.
   * @param date the date of the creation of this tag.
   */
  public void setDate( Date date )
  {
    this.date = date;
  }

  /**
   * Return the author of this tag.
   * @return the author of this tag.
   */
  public String getAuthor()
  {
    return author;
  }

  /**
   * Set the author of this tag.
   * @param author the author of this tag.
   */
  public void setAuthor( String author )
  {
    this.author = author;
  }

  public int compareTo( Object object )
  {
    if ( object != null )
    {
      Tag tag = (Tag) object;

      return this.endRevision.compareTo( tag.getEndRevision() );
    }
    return -1;
  }
}
