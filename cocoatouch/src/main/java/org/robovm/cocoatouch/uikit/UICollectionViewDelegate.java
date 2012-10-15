/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html">UICollectionViewDelegate Protocol Reference</a>
 *   @since Available in iOS 6.0 and later.
 * </div>
 */
@Protocol
public interface /*<name>*/ UICollectionViewDelegate /*</name>*/ /*<implements>*/ extends UIScrollViewDelegate /*</implements>*/ {

    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:canPerformAction:forItemAtIndexPath:withSender:">- (BOOL)collectionView:(UICollectionView *)collectionView canPerformAction:(SEL)action forItemAtIndexPath:(NSIndexPath *)indexPath withSender:(id)sender</a>
     * @since Available in iOS 6.0 and later.
     */
    boolean canPerformAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, NSObject sender);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didDeselectItemAtIndexPath:">- (void)collectionView:(UICollectionView *)collectionView didDeselectItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    void didDeselectItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didEndDisplayingCell:forItemAtIndexPath:">- (void)collectionView:(UICollectionView *)collectionView didEndDisplayingCell:(UICollectionViewCell *)cell forItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    void didEndDisplayingCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:">- (void)collectionView:(UICollectionView *)collectionView didEndDisplayingSupplementaryView:(UICollectionReusableView *)view forElementOfKind:(NSString *)elementKind atIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    void didEndDisplayingSupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didHighlightItemAtIndexPath:">- (void)collectionView:(UICollectionView *)collectionView didHighlightItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    void didHighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didSelectItemAtIndexPath:">- (void)collectionView:(UICollectionView *)collectionView didSelectItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    void didSelectItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didUnhighlightItemAtIndexPath:">- (void)collectionView:(UICollectionView *)collectionView didUnhighlightItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    void didUnhighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:performAction:forItemAtIndexPath:withSender:">- (void)collectionView:(UICollectionView *)collectionView performAction:(SEL)action forItemAtIndexPath:(NSIndexPath *)indexPath withSender:(id)sender</a>
     * @since Available in iOS 6.0 and later.
     */
    void performAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, NSObject sender);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:shouldDeselectItemAtIndexPath:">- (BOOL)collectionView:(UICollectionView *)collectionView shouldDeselectItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    boolean shouldDeselectItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:shouldHighlightItemAtIndexPath:">- (BOOL)collectionView:(UICollectionView *)collectionView shouldHighlightItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    boolean shouldHighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:shouldSelectItemAtIndexPath:">- (BOOL)collectionView:(UICollectionView *)collectionView shouldSelectItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    boolean shouldSelectItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:shouldShowMenuForItemAtIndexPath:">- (BOOL)collectionView:(UICollectionView *)collectionView shouldShowMenuForItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    boolean shouldShowMenuForItem(UICollectionView collectionView, NSIndexPath indexPath);
    /*</methods>*/

}